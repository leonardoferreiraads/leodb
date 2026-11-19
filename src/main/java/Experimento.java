import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Experimento {
    public static void main(String[] args) {
        ByteBuffer buf = ByteBuffer.allocate(16);

        buf.putShort(0, (short) 258);
        System.out.println(buf.get(0));        // 1
        System.out.println(buf.get(1));        // 2
        System.out.println(buf.getShort(0));   // 258

        byte[] dados = "olá".getBytes(StandardCharsets.UTF_8);
        buf.put(4, dados);

        byte[] lido = new byte[dados.length];
        buf.get(4, lido);
        System.out.println(new String(lido, StandardCharsets.UTF_8));  // olá
    }
}