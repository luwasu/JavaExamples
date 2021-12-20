package lambdasAndStreams.ZZZ_e_capturingVariables;


import java.time.Year;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Todo: TBD

public class CaptureVariables {

    Map<Year, Integer> getClassSizes(List<Student> students) {
        final Map<Year, Integer> classSizes = new HashMap<>();
        students.stream().forEach(s ->
                classSizes.compute(
                        s.getGraduationYear(),
                        (k, v) -> (v == null) ? 1 : 1 + v));
        return classSizes;
    }
}





