package com.fightinggame.game.resources;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Assets {

    public static final AssetManager manager = new AssetManager();

    // gameplay assets
    // sprites package
    public static final String BLOCK_SPRITE_SHEET = "sprites/BlockSpriteSheet.png";
    public static final String HURT_SPRITE_SHEET = "sprites/HurtSpriteSheet.png";
    public static final String KICK_SPRITE_SHEET = "sprites/KickSpriteSheet.png";
    public static final String PUNCH_SPRITE_SHEET = "sprites/PunchSpriteSheet.png";
    public static final String WALK_SPRITE_SHEET = "sprites/WalkSpriteSheet.png";

    public static final String BACKGROUND_TEXTURE = "texture/Background.png";
    public static final String WIN_SPRITE_SHEET = "sprites/WinSpriteSheet.png";
    public static final String GAMEPLAY_BUTTONS_TEXTURE = "texture/GameplayButtons.png";
    public static final String FRONT_ROPES_TEXTURE = "texture/FrontRopes.png";
    public static final String GAMEPLAY_BUTTONS_ATLAS = "texture/GameplayButtons.atlas";
    public static final String BLOOD_TEXTURE = "texture/Blood.png";
    public static final String LOSE_SPRITE_SHEET = "sprites/LoseSpriteSheet.png";
    public static final String MENU_ITEMS_TEXTURE = "texture/MenuItems.png";
    public static final String BLOOD_ATLAS = "texture/Blood.atlas";
    public static final String IDLE_SPRITE_SHEET = "sprites/IdleSpriteSheet.png";
    public static final String MOBILE_UI_TEXTURE = "texture/MobileUI.png";
    public static final String MOBILE_UI_ATLAS = "texture/MobileUI.atlas";

    // fonts
    public static final String ROBOTO_REGULAR = "fonts/Roboto-regular.ttf";
    public static final String SMALL_FONT = "smallFont.ttf";
    public static final String MEDIUM_FONT = "mediumFont.ttf";
    public static final String LARGE_FONT = "largeFont.ttf";

    // audio
    public static final String BLOCK_AUDIO = "audio/block.mp3";
    public static final String BOO_AUDIO = "audio/boo.mp3";
    public static final String CHEER_AUDIO = "audio/cheer.mp3";
    public static final String CLICK_AUDIO = "audio/click.mp3";
    public static final String HIT_AUDIO = "audio/hit.mp3";
    public static final String MUSIC_AUDIO = "audio/music.ogg";

    //menu
    public static final String MENU_ITEMS_ATLAS = "texture/MenuItems.atlas";

    public void loadAssets() {
        loadGameplayAssets();
    }

    private void loadGameplayAssets() {
        manager.load(BACKGROUND_TEXTURE, Texture.class);
        manager.load(BLOCK_SPRITE_SHEET, Texture.class);
        manager.load(HURT_SPRITE_SHEET, Texture.class);
        manager.load(KICK_SPRITE_SHEET, Texture.class);
        manager.load(PUNCH_SPRITE_SHEET, Texture.class);
        manager.load(WALK_SPRITE_SHEET, Texture.class);
        manager.load(WIN_SPRITE_SHEET, Texture.class);
        manager.load(FRONT_ROPES_TEXTURE, Texture.class);
        manager.load(IDLE_SPRITE_SHEET, Texture.class);
        manager.load(LOSE_SPRITE_SHEET, Texture.class);

        manager.load(GAMEPLAY_BUTTONS_ATLAS, TextureAtlas.class);
        manager.load(BLOOD_ATLAS, TextureAtlas.class);
    }

    public void dispose() {
        manager.dispose();
    }

}
