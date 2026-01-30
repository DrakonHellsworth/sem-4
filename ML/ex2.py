from sklearn.datasets import make_regression
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import cross_val_score

X,y = make_regression(n_samples=100, n_features=1, n_informative=1, n_targets=1,noise=20,random_state=13)
plt.scatter(X,y)
from sklearn.model_selection import train_test_split
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.2,random_state=2)

from sklearn.linear_model import LinearRegression
gd=LinearRegression()

gd.fit(X_train,y_train)

gd.coef_
gd.intercept_

class GBRegressor:
    def __init__(self,learning_rate,epochs):
        self.lr=learning_rate
        self.epochs=epochs
        self.m=100
        self.b=-120

    def fit(self,X,y,y_test):
        for i in range(self.epochs):
            loss_slope_b=-2*np.sum(y-self.m*X.ravel()-self.b)
            loss_slope_m=-2*np.sum((y-self.m*X.ravel()-self.b)*X.ravel())
            self.b=self.b-(self.lr*loss_slope_b)

            self.m=self.m-(self.lr*loss_slope_m)
            y_pred=self.predict(y_test)
            plt.plot(y_test,y_pred)
    def predict (self,X):
        return self.m * X.ravel()+self.b
sgd=GBRegressor(0.01,50)
sgd.fit(X_train,y_train,y_test)
