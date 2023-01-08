import numpy as np 
import matplotlib.pyplot as plt 
import pandas as pd 

df = pd.read_csv('Position_Salaries.csv') 
 
x = df.iloc[:, 1:2].values 
y = df.iloc[:,2:].values

from sklearn.model_selection import train_test_split 

# 70% training and 30% test 
X_train, X_test, y_train, y_test = train_test_split(x, y, test_size=0.3,random_state=109) 

from sklearn import svm 

clf = svm.SVC(kernel='linear') # Linear Kernel

#Train the model using the training sets 
clf.fit(X_train, y_train) 

            #OR
            
# from sklearn.svm import SVR 
# regressor = SVR(kernel = 'rbf') 

#Predict the response for test dataset 
y_pred = clf.predict(X_test) 

#Import scikit-learn metrics module for accuracy calculation 
from sklearn import metrics 

# Model Accuracy: how often is the classifier correct? 
print("Accuracy:",metrics.accuracy_score(y_test, y_pred))
