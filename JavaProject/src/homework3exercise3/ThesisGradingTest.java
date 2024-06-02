package homework3exercise3;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThesisGradingTest {

    ThesisGrading thesisGrading = new ThesisGrading();;
    Double grade1;
    Double grade2;
    Double grade3;

    @Test
    @DisplayName("Test Case 1")
    void twoValidGradesNoThirdNeeded() throws NoSuchGradeException, ThirdExaminerNeededException {
        grade1 = 1.0;
        grade2 = 2.0;
        grade3 = 0.0;
        Double expectedResult = (grade1 + grade2) / 2.0;

        Double actualResult = thesisGrading.calculcateFinalGrade(grade1, grade2, grade3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Case 2")
    void validGradesWithDifferenceLarger2WithThirdGrade() throws NoSuchGradeException, ThirdExaminerNeededException {
        grade1 = 3.0;
        grade2 = 1.0;
        grade3 = 2.0;
        List<Double> grades = new ArrayList<>(List.of(grade1, grade2, grade3));
        Collections.sort(grades);

        Double expectedResult = (grades.get(0) + grades.get(1)) / 2.0;

        Double actualResult = thesisGrading.calculcateFinalGrade(grade1, grade2, grade3);
        assertEquals(expectedResult, actualResult, "grade1: 3.0, grade2: 1.0, grade3: 2.0, return: 1.5, exception: -");
    }

    @Test
    @DisplayName("Test Case 3")
    void testForThirdExaminerNeededException() {
        grade1 = 1.0;
        grade2 = 3.0;
        grade3 = 0.0;

        assertThrows(ThirdExaminerNeededException.class, () -> thesisGrading.calculcateFinalGrade(grade1, grade2, grade3), "grade1: 1.0, grade2: 3.0, grade3: 0.0, return: -, exception: ThirdExaminerNeedException");
    }

    @Test
    @DisplayName("Test Case 4")
    void testNoSuchGrade1Exception() {
        grade1 = 1.1;
        grade2 = 2.0;
        grade3 = 0.0;

        assertThrows(NoSuchGradeException.class, () -> thesisGrading.calculcateFinalGrade(grade1, grade2, grade3), "grade1: 1.1, grade2: 2.0, grade3: 0.0, return: -, exception: NoSuchGradeException");
    }

    @Test
    @DisplayName("Test Case 5")
    void testNoSuchGrade2Exception() {
        grade1 = 1.0;
        grade2 = 0.0;
        grade3 = 0.0;

        assertThrows(NoSuchGradeException.class, () -> thesisGrading.calculcateFinalGrade(grade1, grade2, grade3), "grade1: 1.0, grade2: 0.0, grade3: 0.0, return: -, exception: NoSuchGradeException");
    }


    @Test
    @DisplayName("Test Case 6")
    void twoFailedGradesIncludedWithThirdExaminer() throws NoSuchGradeException, ThirdExaminerNeededException {
        grade1 = 2.0;
        grade2 = 5.0;
        grade3 = 5.0;

        Double expectedResult = 5.0;

        Double actualResult = thesisGrading.calculcateFinalGrade(grade1, grade2, grade3);


        assertEquals(expectedResult, actualResult, "grade1:2.0, grade2: 5.0, grade3: 5.0, return: 5.0, exception: -");
    }



}