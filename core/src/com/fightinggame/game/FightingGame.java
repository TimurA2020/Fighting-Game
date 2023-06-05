package com.fightinggame.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fightinggame.game.resources.Assets;
import com.fightinggame.game.screens.MainScreen;

public class FightingGame extends Game {
	public SpriteBatch batch;
	public Assets assets;

	public MainScreen screen;

	@Override
	public void create () {
		batch = new SpriteBatch();
		assets = new Assets();

		assets.loadAssets();
		assets.manager.finishLoading();

		screen = new MainScreen(this);
		setScreen(screen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		assets.dispose();
	}
}
