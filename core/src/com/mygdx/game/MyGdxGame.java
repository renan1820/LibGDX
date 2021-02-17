package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {

	private AssetManager assetManager;

	private SpriteBatch batch;
	private Texture felpudo1;

	@Override
	public void create () {
		assetManager = new AssetManager();

		for(int i = 1 ; i <=7 ; i++){
			assetManager.load("Felpudo/felpudo"+i+".png", Texture.class);
		}

		assetManager.finishLoading();

		boolean loaded = assetManager.isLoaded("Felpudo/felpudo1.png");
		 Gdx.app.log("Log", String.valueOf(loaded));

		 loaded = assetManager.isLoaded("Felpudo/felpudo9.png");
		 Gdx.app.log("Log", String.valueOf(loaded));
		 batch = new SpriteBatch();
		felpudo1 = assetManager.get("Felpudo/felpudo1.png", Texture.class );
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(felpudo1, 0, 0, 300, 300 );
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}
