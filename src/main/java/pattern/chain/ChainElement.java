package pattern.chain;

public interface ChainElement {
    void execute(Request topic);

    void goNext(ChainElement next);
}
