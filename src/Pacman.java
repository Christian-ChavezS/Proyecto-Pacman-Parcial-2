import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pacman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pacman extends Actor {
    private static final int OFFSET = 5;
    private static final int LEFT_DIRECTION = 1;
    private static final int RIGHT_DIRECTION = 0;

    private String[][] images;

    private int currentImage = 0;
    private int delayboca = 0;
    private int offsetX = 0;
    private int offsetY = 0;
    private int points;
    private int currentDirection = RIGHT_DIRECTION;


    public void act() {
        //moveMouth();
        handleKeys();

        moveIfNoCollision1(offsetX, offsetY);
        showHud();
        eatItems();

    }

    private void eatItems() {
        Item item = (Item) getOneIntersectingObject(Item.class);

        if (item != null) {
            points += item.getScore();
            getWorld().removeObject(item);
        }
    }


    private void handleKeys() {
        if (Greenfoot.isKeyDown("Right")) {
            offsetY = 0;
            offsetX = OFFSET;
            currentDirection = RIGHT_DIRECTION;
        } else if (Greenfoot.isKeyDown("Left")) {
            offsetY = 0;
            offsetX = -OFFSET;
            currentDirection = LEFT_DIRECTION;
        } else if (Greenfoot.isKeyDown("Up")) {
            offsetX = 0;
            offsetY = -OFFSET;
        } else if (Greenfoot.isKeyDown("Down")) {
            offsetX = 0;
            offsetY = OFFSET;
        }
    }

    private void moveIfNoCollision1(int dx, int dy) {
        if (this.getOneObjectAtOffset(dx * 6, dy * 6, Bricks.class) == null) {
            setLocation(getX() + dx, getY() + dy);
        }

    }

    //Tenia problemas con las imagenes y no lo pude implementar
    /* private void moveMouth(){
        delayMouth++;
        if(delayMouth == 10){
            currentImage = (currentImage + 1) % images.length;
            setImage(images[currentDirection][currentImage]);
            delayboca = 0;
        }

    }*/

    private void showHud() {
        getWorld().showText(Integer.toString(points), 550, 30);
    }

}