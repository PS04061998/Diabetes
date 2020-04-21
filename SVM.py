import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import pickle

data = pd.read_csv("diabetes.csv") 

data.shape
data.head()

X = data.drop('Outcome', axis=1)
y = data['Outcome']

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.20)

from sklearn.svm import SVC
svclassifier = SVC(kernel='linear')
svclassifier.fit(X_train, y_train)

y_preds = svclassifier.predict(X_test)

from sklearn.metrics import classification_report, confusion_matrix
print(confusion_matrix(y_test,y_preds))
print(classification_report(y_test,y_preds))

from sklearn.externals import joblib 
  
# Save the model as a pickle in a file 
joblib.dump(svclassifier, 'model.pkl') 