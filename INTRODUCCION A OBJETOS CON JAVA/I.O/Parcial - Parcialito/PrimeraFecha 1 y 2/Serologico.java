public class Serologico extends Test
{
    private Muestra muestra;
    
    public Serologico()
    {
    }
    
    public int tiempo() {
        return 15;
    }
    
    public boolean esSerologico1() {
        return true;
    }

    public int esSerologico2() {
        return 1;
    }

    public int contarSerologico(int t) {
        return t+1;
    }
}
