package com.fightinggame.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.*;
import com.fightinggame.game.FightingGame;
import com.fightinggame.game.resources.Assets;
import com.fightinggame.game.resources.GlobalVariables;

public class MainScreen implements Screen {

    private final FightingGame fightingGame;
    private final OrthographicCamera orthographicCamera;
    private final Viewport viewport;

    private Texture backgroundTexture;
    private Texture frontRopesTexture;

    public MainScreen(FightingGame fightingGame) {
        this.fightingGame = fightingGame;

        //setup viewport
        orthographicCamera = new OrthographicCamera(GlobalVariables.WORLD_WIDTH, GlobalVariables.WORLD_HEIGHT);
        viewport = new ExtendViewport(GlobalVariables.WORLD_WIDTH, GlobalVariables.WORLD_HEIGHT * 0.85f,
                GlobalVariables.WORLD_WIDTH, 0, orthographicCamera);
        initializeGameArea();
    }

    private void initializeGameArea() {
        backgroundTexture = Assets.manager.get(Assets.BACKGROUND_TEXTURE);
        frontRopesTexture = Assets.manager.get(Assets.FRONT_ROPES_TEXTURE);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);

        //sprite batch to use camera
        fightingGame.batch.setProjectionMatrix(viewport.getCamera().combined);

        fightingGame.batch.begin();
        fightingGame.batch.draw(backgroundTexture, 0, 0,
                backgroundTexture.getWidth() * GlobalVariables.WORLD_SCALE,
                backgroundTexture.getHeight() * GlobalVariables.WORLD_SCALE);
        //finish drawing
        fightingGame.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
