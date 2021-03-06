import by.gsu.epamlab.*;
import by.gsu.epamlab.beans.Mark;
import by.gsu.epamlab.beans.Result;
import by.gsu.epamlab.load.ResultImplCsv;

import java.util.List;

public class RunnerDbl {

    public static void main(String[] args) {
        try {
            Mark.Type typeMark = Mark.Type.CSV_DBL;
            Mark.setTypeMark(typeMark);
            String fileName = Constants.PATH + Constants.FILE_NAME + "_dbl";

            RunnerLogic.init();

            RunnerLogic.load(new ResultImplCsv(fileName));

            RunnerLogic.meanMarks();

            List<Result> list = RunnerLogic.printTestByCurrentMonth();

            RunnerLogic.printTestsInTheLatestDay(list);

        } catch (IllegalStateException e) {
            System.err.println(e);
        } finally {
            DAO.close();
        }
    }
}
