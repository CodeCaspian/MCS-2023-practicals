import numpy as np 
import matplotlib.pyplot as plt 
import pandas as pd 

df = pd.read_csv('Position_Salaries.csv') 
x = df.iloc[:, 1:2].values 
y = df.iloc[:,2:].values

from sklearn.model_selection import train_test_split 
X_train, X_test, y_train, y_test = train_test_split(x, y, test_size=0.3,random_state=None) 

from sklearn import svm 
clf = svm.SVC(kernel='linear') # Linear Kernel
clf.fit(X_train, y_train) 

#OR           
# from sklearn.svm import SVR 
# clf = SVR(kernel = 'rbf') 

y_pred = clf.predict(X_test) 

from sklearn import metrics 
print("Accuracy:",metrics.accuracy_score(y_test, y_pred))
