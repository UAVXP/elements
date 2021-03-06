package com.yegorov.alexey.elements.api;

public class ElementsLiquid
{
    static
    {
        System.loadLibrary("elements");
    }

    public static native int create(boolean preview);
    public static native boolean startup(int id, int width, int height, int quality);
    public static native boolean destroy(int id);
    public static native boolean background(int id, String asset);
    public static native boolean color(int id, float r, float g, float b, float a);
    public static native boolean touch(int id, float x, float y, int action);
    public static native boolean render(int id);
    public static native boolean acceleration(int id, float x, float y, float z);
    public static native boolean rotation(int id, float x, float y);
}
