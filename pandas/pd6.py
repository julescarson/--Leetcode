#2881
import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    # assign for new column, lambda function within to just grab the 2X salary
    return employees.assign(bonus = lambda x: (x["salary"] * 2))