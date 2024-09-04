#2886
import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    # astype fn, change datatype
    students.grade = students.grade.astype(int)
    return students
    