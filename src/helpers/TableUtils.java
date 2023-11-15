package helpers;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class TableUtils {
    public static void renderMenu(List<String> options, String menuTitle){
        CellStyle centerStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
       table.setColumnWidth(0, 35, 40);

        table.addCell(menuTitle, centerStyle);
        int i  =1 ;
        for (String menu: options){
            table.addCell(i+"."+menu, centerStyle);
            i++;
        }

        System.out.println( table.render());;

    }
}
