package pattern.chain;

public class CRC implements ChainElement{
    private Request request;
    @Override
    public void execute(Request topic) {
        request = topic;
        System.out.println("CRC calculated");
        System.out.println(request.getName());
    }

    @Override
    public void goNext(ChainElement next) {
        next.execute(request);
    }
}
