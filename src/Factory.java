import java.util.Comparator;
import java.util.List;

public class Factory {
    private String fileName = "src/com/company/DeviceInfo";
    private BufferReadFromFile brf = new BufferReadFromFile();
    private List<Device> listDevice = brf.readToObjectFromFile(fileName);

    public void viewAllDevice() {
        listDevice.stream().forEach(System.out::println);
    }

    public void searchDevice(int serialNumber) {
        System.out.println(listDevice.stream()
                .filter(el -> el.getSerialNumber() == serialNumber)
                .findAny());
    }

    public void viewSortedList() {
        listDevice.stream()
                .sorted(Comparator.comparing(Device::getBrand))
                .forEach(System.out::println);
    }

    public void viewDeviceMore400() {
        listDevice.stream()
                .filter(device -> device.getPrice() > 400)
                .forEach(System.out::println);
    }

    public void theMostExpensiveDevice() {
        System.out.println(listDevice.stream().max(Comparator.comparingInt(Device::getPrice)).get());
    }

    public void viewDevicePriceLess800() {
        System.out.println(listDevice.stream().filter(device -> device.getPrice() > 800
                || String.valueOf(device.getSerialNumber()).contains("0")));
    }
}
