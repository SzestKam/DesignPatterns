package pattern.chain;

public class CipherROT13 implements ChainElement {
    private Request request;

    @Override
    public void execute(Request request) {
        this.request = request;
        System.out.println("ROT13 executed");
        System.out.println(this.request.getName());
    }

    @Override
    public void goNext(ChainElement next) {
        next.execute(this.request);
    }
}
