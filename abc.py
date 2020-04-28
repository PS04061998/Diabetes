from flask import Flask, request, jsonify
from sklearn.externals import joblib 
import pickle
import pandas as pd 
import numpy as np

# Create Flask object to run
app = Flask(__name__)



@app.route('/predict', methods=['GET', 'POST'])
def predict():

	preg = request.values.get("pregnancy")
	bmi = request.values.get("bmiValue")
	age = request.values.get("age")
	glucose = request.values.get("glucose")
	bp = request.values.get("pressure")
	
	
	testData = np.array([preg, bmi, age, glucose, bp]).reshape(1,5)
	class_prediced = int(model.predict(testData)[0])
	output = "Predicted Pre diabetic Class: " + str(class_prediced)
	
	return (output)
	
	
# Load the pre-trained and persisted SVM model
# Note: The model will be loaded only once at the start of the server
def load_model():
	
	global model
	model = joblib.load('model.pkl')  
	

if __name__ == "__main__":
	print("**Starting Server...")
	
	# Call function that loads Model
	load_model()
	
	# Run Server
	app.run(host="0.0.0.0")
