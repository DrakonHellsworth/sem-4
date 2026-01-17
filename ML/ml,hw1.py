
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import sklearn
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

df=pd.read_csv('StudentPerformance.csv')
df.head()

plt.scatter(df['Hours Studied'],df['Performance Index'])
plt.xlabel('Hours Studied')
plt.ylabel('Performance Index') 
plt.show()

x=df.iloc[:,0:1]
y=df.iloc[:,-1]

x_train,x_test,y_train,y_test=train_test_split(x,y,test_size=0.2,random_state=2)
x_train.shape
y_train.shape

from sklearn.linear_model import LinearRegression
lr=LinearRegression()
lr.fit(x_train,y_train)

lr.coef_   #m slope
lr.intercept_   # b that is y intercept
y_pred=lr.predict(x_test)
x_test
y_pred
#y=mx+c
m=lr.coef_
c=lr.intercept_
y=m*x+c
y
plt.scatter(df['Hours Studied'],df['Performance Index'])
plt.plot(x_test,y_pred,color='red')
plt.xlabel('Hours Studied')
plt.ylabel('Performance Index')
plt.show()