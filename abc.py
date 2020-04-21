from flask import Flask, request, jsonify
from sklearn.externals import joblib 
import pickle
import pandas as pd 
import numpy as np

# Create Flask object to run
app = Flask(__name__)



@app.route('/predict', methods=['GET', 'POST'])
def predict():

	d = predict()

	# Get values from browser
	# preg = request.args['pregnancies']
	# glucose = request.args['glucose']
	# bp = request.args['bloodpressure']
	# bmi = request.args['bmi']
	# age = request.args['age']
	testData = np.array([d]).reshape(1,5)
	class_prediced = int(model.predict(testData)[0])
	output = "Predicted prediabetic Class: " + str(class_prediced)

	return jsonify(output)
	
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
	app.run()
