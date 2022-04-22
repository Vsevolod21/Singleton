import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int e : source) {
            if (e <= treshold) {
                result.add(e);
                logger.log("Элемент " + e + " проходит");
            } else {
                logger.log("Элемент " + e + " не проходит");
            }
        }

        logger.log("Прошло фильтр " + result.size() +
                " элементов из " + source.size());
        return result;
    }
}
