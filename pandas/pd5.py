#2880
import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    # use location of student_id where 101, then specify columns
    return students.loc[students["student_id"] == 101, ["name", "age"]]
   