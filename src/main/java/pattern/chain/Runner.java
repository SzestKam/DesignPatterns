package pattern.chain;

public class Runner {
    public static void main(String[] args) {
        Request req = new Request("Simple request object");

        ChainElement rot13 = new CipherROT13();
        ChainElement zipper = new Compress();
        ChainElement crc = new CRC();

        rot13.execute(req);
        rot13.goNext(zipper);
        zipper.goNext(crc);
    }
}
