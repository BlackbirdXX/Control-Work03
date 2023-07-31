package Program;

public class Counter implements AutoCloseable {

    public static int count = 1;
    public static void add(){
        count++;
    }


    public int getCount(){
        return count;
    }
    @Override
    public void close() throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
    
}
