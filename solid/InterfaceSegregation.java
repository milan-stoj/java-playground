/**
 * This class shows a bad example of InterfaceSegregation.
 */
class InterfaceSegregation {
    public static void main(String[] args) {
        // file implements DataIO interface, which has methods for retreiving all types of data storage types.
        File file = new File("File data");
        System.out.println(file.data);
    }
}



interface DataIO {
    void writeDataToFile(String data);
    void writeDataToDatabase(String data);
    void writeDataToSatelite(String data);
    String readDataFromFile(File file);
    String readDataFromDatabase(Database db);
    String readDataFromSatelite(Satelite satelite);
}

class File implements DataIO {
    String data;

    File(String data) {
        this.data = data;
    }

	@Override
	public void writeDataToFile(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToFile'");
	}

	@Override
	public void writeDataToDatabase(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToDatabase'");
	}

	@Override
	public void writeDataToSatelite(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToSatelite'");
	}

	@Override
	public String readDataFromFile(File file) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromFile'");
	}

	@Override
	public String readDataFromDatabase(Database db) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromDatabase'");
	}

	@Override
	public String readDataFromSatelite(Satelite satelite) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromSatelite'");
	}

}

class Satelite implements DataIO {
    String data;

    Satelite(String data) {
        this.data = data;
    }

	@Override
	public void writeDataToFile(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToFile'");
	}

	@Override
	public void writeDataToDatabase(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToDatabase'");
	}

	@Override
	public void writeDataToSatelite(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToSatelite'");
	}

	@Override
	public String readDataFromFile(File file) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromFile'");
	}

	@Override
	public String readDataFromDatabase(Database db) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromDatabase'");
	}

	@Override
	public String readDataFromSatelite(Satelite satelite) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromSatelite'");
	}

}

class Database implements DataIO {
    String data;

    Database(String data) {
        this.data = data;
    }

	@Override
	public void writeDataToFile(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToFile'");
	}

	@Override
	public void writeDataToDatabase(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToDatabase'");
	}

	@Override
	public void writeDataToSatelite(String data) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'writeDataToSatelite'");
	}

	@Override
	public String readDataFromFile(File file) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromFile'");
	}

	@Override
	public String readDataFromDatabase(Database db) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromDatabase'");
	}

	@Override
	public String readDataFromSatelite(Satelite satelite) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'readDataFromSatelite'");
	}

}
