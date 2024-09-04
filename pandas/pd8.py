#2884
import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    # simply multiply by scalar
    employees['salary'] = employees['salary'] * 2
    return employees 