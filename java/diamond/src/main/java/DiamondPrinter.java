import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> output = new ArrayList();
        var inner = 1;
        var outer = (a - 65);
        output.add(addSpace(outer) + 'A' + addSpace(outer));
        for(char i = 'B'; i <= a; i++){
            outer--;
            output.add(addSpace(outer) + i + addSpace(inner) + i + addSpace(outer));
            inner += 2;
        }
        return addReverse(output);
    }

    static List<String> addReverse(List<String> list){
        for(int i = list.size() - 2; i >=0; i--){
            list.add(list.get(i));
        }
         return list;
    }

    static String addSpace(int num){
        var space = "";
        for(var i = 0; i < num; i++){
            space += " ";
        }
        return space;
    }
}
