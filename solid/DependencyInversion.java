class DependencyInversion {

    public static void main(String[] args) {
        // Not using DependencyInversion:
        DatabaseReader dbReader = new DatabaseReader();
        dbReader.readData("Hello, db data!");

        FileReader fileReader = new FileReader();
        fileReader.readData("Hello, file data!");

        // Using dependency inversion:
        // reader class depends on the DataIO abstraction, so any DataIO reader can be passed into a class instance.
        Reader reader = new Reader(dbReader);
        reader.dataReader.readData("Hello, world!");
    }

}

interface DataIO {
    void readData(String data);
}

class DatabaseReader implements DataIO {
    @Override
	public void readData(String data) {
        System.out.println(data);
    }
}

class FileReader implements DataIO {
    @Override
	public void readData(String data) {
        System.out.println(data);
    }
}

class Reader {
    DataIO dataReader;

    Reader(DataIO dataReader) {
        this.dataReader = dataReader;
    }
}
