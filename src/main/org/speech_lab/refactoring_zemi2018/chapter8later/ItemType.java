package org.speech_lab.refactoring_zemi2018.chapter8later;

public class ItemType
{
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFT = new ItemType(2);

    private final int _typecode;
  

    public ItemType(int typecode)
    {
	_typecode = typecode;
	
    }

    public int getTypecode()
    {
	return _typecode;
    }
}
