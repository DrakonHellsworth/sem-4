#Simple linear regression using matplotlib and pandas
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import sklearn
from sklearn.model_selection import train_test_split


df=pd.read_csv('placement.csv')
df.head()
plt.scatter(df['cgpa'],df['package'])
plt.xlabel('CGPA')
plt.ylabel('Package')
plt.show()

x=df.iloc[:,0:1] #[starting rows:ending rows, starting columns:ending columns](input)
y=df.iloc[:,-1]  #(output)
x
y

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
y=(m*8.58)+c
y

plt.scatter(df['cgpa'],df['package'])
plt.plot(x_test,y_pred,color='red')
plt.xlabel('CGPA')
plt.ylabel('Package')
plt.show()