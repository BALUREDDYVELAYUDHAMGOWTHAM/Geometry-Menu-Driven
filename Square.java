import java.util.*;
class square{
    int side;
    square()
    {
        side = 0;
    }
    
    int getArea()
    {
        return side * side;
    }

    int getPerimeter()
    {
        return 4 * side;
    }

    int getVolume()
    {
        return side * side * side;
    }
}