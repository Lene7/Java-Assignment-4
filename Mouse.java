//34317996
//L Kriel
//Assignment 4

public class Mouse extends IODevice
{
	public Mouse()
	{
		super("Mouse");
	}
	
	@Override
	public void read()
	{
		System.out.println(getData());
	}
	
	@Override
	public void write(String data)
	{
		setData(getDeviceName() + ">" + data);
	}
	
	@Override
    public void connect() 
	{
        System.out.println("--------Connecting Mouse--------");
        super.open();
        System.out.println("--------Mouse connected--------\n");
    }
	
	@Override
    public void disconnect() {
        System.out.println("--------Disconnecting Mouse--------");
        super.close();
        System.out.println("--------Mouse disconnected--------\n");
    }
	
	public static void main (String[] args)
	{
		Mouse mouse = new Mouse();
		mouse.connect();
		mouse.write("Hello, World!\n");
		mouse.read();
		mouse.disconnect();
	}
}