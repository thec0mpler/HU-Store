
using HU_Store;
using System;

namespace TestConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            using (HUStoreModelContainer ctx = new HUStoreModelContainer())
            {

            }

        }
    }
}