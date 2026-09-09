import static java.lang.Math.*;
public class Main {
  public static void main(String[] args)
  {
    long t[] = new long[11];
    int j = 0;
    for (long i = 3; i < 24; i += 2)
    {
      t[j++] = i;
    }

    float x[] = new float[16];
    float start = -12.0f;
    float end = 2.0f;
    for (int k = 0; k < 16; ++k)
    {
      x[k] = (float)(Math.random() * (end - start) + start);
    }

    double n[][] = new double[11][16];
    CalculElement(n, t, x);
    PrintMatrix(n);
  }

  public static void CalculElement(double n[][], long t[], float x[])
  {
    for (int i = 0; i < n.length; ++i)
    {
      for (int j = 0; j < n[i].length; ++j)
      {
        if (t[i] == 5)
        {
          n[i][j] = cos(asin(1 / pow(E, abs(x[j]))));
        }
        else if (t[i] == 9 || t[i] == 13 || t[i] == 15 || t[i] == 17 || t[i] == 23)
        {
          n[i][j] = log(pow(tan(pow(E, x[j] / 2)), 2));
        }
        else
        {
          n[i][j] = cos(pow(atan(pow((x[j] -  5) / 14, 2)), 2));
        }
      }
    }
  }

  public static void PrintMatrix(double mtx[][])
  {
    int rows = mtx.length;
    for (int i = 0; i < rows; ++i)
    {
      if (mtx[i][0] > 0)
      {
        System.out.print(" ");
      }
      else if (Double.isNaN(mtx[i][0]))
      {
        System.out.print("  ");
      }
      System.out.printf("%.2f", mtx[i][0]);
      for (int j = 1; j < mtx[i].length; ++j)
      {
        if (mtx[i][j] > 0)
        {
          System.out.print(" ");
        }
        else if (Double.isNaN(mtx[i][j]))
        {
          System.out.print("  ");
        }
        System.out.printf(" %.2f", mtx[i][j]);
      }
      System.out.println();
    }
  }

  public static void PrintArr(double arr[])
  {
    for (int i = 0; i < arr.length; ++i)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
