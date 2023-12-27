import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FetchAccNoFromFolder {


    public List<String> fetchAccNo(String path)  {
        List<String> accNos=new ArrayList<>();
        try{
            List<Path> files= Files.list(Paths.get(path)).toList();
            for(int i=0;i<files.size();i++)
            {
                Path file= files.get(i);
                List<String> lines= Files.readAllLines(file);
                if(!lines.isEmpty())
                {
                    accNos.add(lines.get(0));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return accNos;
    }
}
