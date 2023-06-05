package com.fightinggame.game.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.fightinggame.game.FightingGame;
import com.fightinggame.game.resources.Assets;

public class Fighter {

    // num of rows and colums in spr sheet
    private final static int FRAME_ROWS = 2, FRAME_COLS = 3;

    private final static float MOVEMENT_SPEED = 10f;

    private final static float MAX_LIFE = 100f;
    private final static float HIT_STRENGTH = 5f;
    private final static float BLOCK_DAMAGE_FACTOR = 0.2f;

    //fighter characteristics

    private String name;
    private Color color;

    //states

    public enum State {
        BLOCK,
        HURT,
        IDLE,
        KICK,
        LOSE,
        PUNCH,
        WALK,
        WIN
    }

    private float hp;
    private State state;
    private float stateTime;
    private State renderState;
    private float renderStateTime;
    private final Vector2 position = new Vector2();
    private final Vector2 movementDirection = new Vector2();
    private int facing;
    private boolean madeContact;

    //animations
    private Animation<TextureRegion> blockAnimation;
    private Animation<TextureRegion> hurtAnimation;
    private Animation<TextureRegion> idleAnimation;
    private Animation<TextureRegion> kickAnimation;
    private Animation<TextureRegion> loseAnimation;
    private Animation<TextureRegion> punchAnimation;
    private Animation<TextureRegion> walkAnimation;
    private Animation<TextureRegion> winAnimation;


    public Fighter(FightingGame game, String name, Color color) {
        this.name = name;
        this.color = color;

        //initializing animations;
        initializeBlockAnimation();
        initializeHurtAnimation();
        initializeIdleAnimation();
        initializeKickAnimation();
        initializeLoseAnimation();
        initializePunchAnimation();
        initializeWalkAnimation();
        initializeWinAnimation();
    }

    private void initializeBlockAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        blockAnimation = new Animation<>(0.05f, frames);
    }

    private void initializeHurtAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        hurtAnimation = new Animation<>(0.02f, frames);
    }

    private void initializeIdleAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        idleAnimation = new Animation<>(0.01f, frames);
    }

    private void initializeKickAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        kickAnimation = new Animation<>(0.05f, frames);
    }

    private void initializeLoseAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        loseAnimation = new Animation<>(0.05f, frames);
    }

    private void initializePunchAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        punchAnimation = new Animation<>(0.04f, frames);
    }

    private void initializeWalkAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        walkAnimation = new Animation<>(0.07f, frames);
    }

    private void initializeWinAnimation() {
        Texture spriteSheet = Assets.manager.get(Assets.BLOCK_SPRITE_SHEET);
        TextureRegion[] frames = getAnimationFrames(spriteSheet);
        winAnimation = new Animation<>(0.05f, frames);
    }

    private TextureRegion[] getAnimationFrames(Texture spriteSheet) {
        TextureRegion[][] buffer = TextureRegion.split(spriteSheet, spriteSheet.getWidth() / FRAME_COLS,
                spriteSheet.getHeight() / FRAME_ROWS);
        TextureRegion[] frames = new TextureRegion[FRAME_ROWS * FRAME_COLS];
        int index = 0;

        for (int i = 0; i < FRAME_ROWS; i++) {
            for (int j = 0; j < FRAME_COLS; j++) {
                frames[index++] = buffer[i][j];
            }
        }

        return frames;
    }

}
