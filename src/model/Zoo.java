package model;

public class Zoo {
    private String name;
    private Location location;
    private int size;
    private Person[] staffList;
    private Cage[] cageList = new Cage[10];
    private String openHours;

    public Zoo (String name, Location location, int size, String openHours) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.openHours = openHours;
    }

    public void addCage(Cage cage) {
        for (int i = 0; i < cageList.length; i++) {
            if (cageList[i] == null) {
                cageList[i] = cage;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Person[] getStaffList() {
        return staffList;
    }

    public void setStaffList(Person[] staffList) {
        this.staffList = staffList;
    }

    public Cage[] getCageList() {
        return cageList;
    }

    public void setCageList(Cage[] cageList) {
        this.cageList = cageList;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }
}
