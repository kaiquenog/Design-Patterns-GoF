package org.example.structualPatterns.facade;

public class ComputerFacade {
    private static final int BOOT_SECTOR = 0;
    private static final int SECTOR_SIZE = 0;
    private static final int BOOT_ADDRESS = 0;
    private Cpu cpu = null;
    private Memory memoria = null;
    private HardDisk hardDrive = null;

    public ComputerFacade(Cpu cpu,
                          Memory memory,
                          HardDisk hardDisk) {
        this.cpu = cpu;
        this.memoria = memory;
        this.hardDrive = hardDisk;
    }

    public void ligarComputador() {
        cpu.start();
        String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
        memoria.load(BOOT_ADDRESS, hdBootInfo);
        cpu.execute();
        memoria.free(BOOT_ADDRESS, hdBootInfo);
    }
}
