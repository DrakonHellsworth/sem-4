#Predicting Housing Prices: Develop a regression model to predict  house prices based on features like location, size, and amenities. 

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
# Load the dataset
data = pd.read_csv('housing_prices.csv')
# Display the first few rows of the dataset
print(data.head())
#data split
#data preprocessing
#model training
X = data.drop(columns=['Price'])
y = data['Price']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)
model = LinearRegression()
model.fit(X_train, y_train)
#save model(pickle)
import pickle
with open('house_price_model.pkl', 'wb') as file:
    pickle.dump(model, file)
#evalutae(mse, r2_score)
y_pred = model.predict(X_test)
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)
print(f'Mean Squared Error: {mse}')
print(f'R^2 Score: {r2}')