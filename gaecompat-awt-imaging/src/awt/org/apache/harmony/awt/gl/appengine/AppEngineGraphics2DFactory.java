package org.apache.harmony.awt.gl.appengine;

import java.io.IOException;

import org.apache.harmony.awt.gl.CommonGraphics2DFactory;
import org.apache.harmony.awt.gl.MultiRectArea;
import org.apache.harmony.awt.gl.font.FontManager;
import org.apache.harmony.awt.wtk.NativeWindow;
import org.apache.harmony.awt.wtk.WindowFactory;

import com.gaecompat.imaging.font.GaeCompatFontManager;
import com.google.code.appengine.awt.Font;
import com.google.code.appengine.awt.Graphics2D;
import com.google.code.appengine.awt.GraphicsEnvironment;


public class AppEngineGraphics2DFactory extends CommonGraphics2DFactory
{
	public AppEngineGraphics2DFactory()
	{
		inst = this;
	}

	public GraphicsEnvironment createGraphicsEnvironment(WindowFactory wf)
	{
		return new AppEngineGraphicsEnvironment();
	}

//	@Override
//	public Font embedFont(String fontFilePath) throws IOException
//	{
//		return null;
//	}

	@Override
	public Font embedFont(byte[] fontBytes) throws IOException
	{
		return null;
	}

	public FontManager getFontManager()
	{
//		return AppEngineFontManager.inst;
		return GaeCompatFontManager.getInstance();
	}

	public Graphics2D getGraphics2D(NativeWindow win, int translateX,
			int translateY, MultiRectArea clip)
	{
		return null;
	}

	public Graphics2D getGraphics2D(NativeWindow win, int translateX,
			int translateY, int width, int height)
	{
		return null;
	}
}
