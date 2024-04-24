class CPU {
    public void freeze() {
        System.out.println("CPU: Freeze.");
    }

    public void jump(long position) {
        System.out.println("CPU: Jump to " + position);
    }

    public void execute() {
        System.out.println("CPU: Execute.");
    }
}

class Memory {
    private char[] data = new char[1024];

    public void load(long position, char[] data) {
        System.out.println("Memory: Loading data...");
        int length = Math.min(data.length, this.data.length - (int) position);
        System.arraycopy(data, 0, this.data, (int) position, length);
    }

    public void dump() {
        System.out.println("Memory: Dumping data...");
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] != 0) {
                System.out.printf("Address %04d: %c\n", i, this.data[i]);
            }
        }
    }
}

class HardDrive {
    private char[] sectors;

    public HardDrive() {
        sectors = new char[20];
        for (int i = 0; i < sectors.length; i++) {
            sectors[i] = (char) ('A'+i);
        }
    }

    public char[] read(long lba, int size) {
        System.out.println("HardDrive: Reading data...");
        char[] buffer = new char[size];
        System.arraycopy(sectors, (int) lba, buffer, 0, Math.min(size, sectors.length - (int) lba));
        return buffer;
    }
}

class ComputerFacade {
    private static final long BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 0;
    private static final int SECTOR_SIZE = 1024;

    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void start() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
        memory.dump();
    }
}

public class Facade {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
