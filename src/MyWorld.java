
    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    /**
     * Write a description of class MyWorld here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class MyWorld extends World {

        /**
         * Constructor for objects of class MyWorld.
         */
        public MyWorld() {
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(600, 400, 1);
            prepare();
        }


        private void prepare() {
            Environment();
            CreatePacman();
            CreateFood();

        }

        private void CreateFood() {
            addObject(new Banana(), 155, 218);
            addObject(new Banana(), 39, 286);
            addObject(new Banana(), 385, 289);
            addObject(new Apple(), 224, 109);
            addObject(new Apple(), 108, 39);
            addObject(new Apple(), 502, 40);
            addObject(new Tablet(), 394, 40);
            addObject(new Tablet(), 191, 358);
            addObject(new Tablet(), 321, 292);
        }

        private void Environment() {
            //Pared Izquierda
            for (int y = 0; y < 450; y = y + 25) {
                Bricks bricks = new Bricks();
                addObject(bricks, 0, y);
            }

            //Pared Derecha
            for (int y = 0; y < 300; y = y + 25) {
                Bricks bricks = new Bricks();
                addObject(bricks, 600, y);
            }

            for (int y = 360; y < 400; y = y + 25) {
                Bricks bricks = new Bricks();
                addObject(bricks, 600, y);
            }

            //Pared Superior
            for (int x = 0; x < 600; x = x + 25) {
                Bricks bricks = new Bricks();
                addObject(bricks, x, 0);
            }

            //Pared Inferior
            for (int x = 0; x < 650; x = x + 25) {
                Bricks bricks = new Bricks();
                addObject(bricks, x, 400);
            }


            //------------------------------BRICKS--------------------------------

            for (int y = 30; y < 155; y = y + 25) {
                Bricks bricks = new Bricks();
                addObject(bricks, 75, y);
            }

            for (int y = 30; y < 310; y = y + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, 350, y);
            }

            for (int y = 75; y < 380; y = y + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, 500, y);
            }

            for (int y = 75; y < 250; y = y + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, 186, y);
            }

            for (int x = 25; x < 250; x = x + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, x, 250);
            }

            for (int x = 270; x < 350; x = x + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, x, 168);
            }

            for (int x = 186; x < 270; x = x + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, x, 75);
            }

            for (int x = 150; x < 415; x = x + 23) {
                Bricks bricks = new Bricks();
                addObject(bricks, x, 326);
            }
        }

        private void CreatePacman() {
            pacman pacman = new pacman();
            addObject(pacman, 35, 35);
        }


    }
