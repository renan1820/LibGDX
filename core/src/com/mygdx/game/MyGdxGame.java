package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyGdxGame extends ApplicationAdapter {

	private ShapeRenderer shapeRenderer;
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setAutoShapeType(true);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin();
		shapeRenderer.setColor(Color.RED);
//		shapeRenderer.setColor(1,0,1,1);
		shapeRenderer.set(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.rect(100,100, 300, 400);
		shapeRenderer.rect(500, 200, 150, 150  );

		shapeRenderer.setColor(Color.GOLD);
		shapeRenderer.circle(500,500, 200);
		shapeRenderer.end();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
