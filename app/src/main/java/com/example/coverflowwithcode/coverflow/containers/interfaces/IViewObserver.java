package com.example.coverflowwithcode.coverflow.containers.interfaces;

import android.view.View;

public interface IViewObserver {
	/**
	 * @param v View which is getting removed
	 * @param position View position in adapter
	 */
	void onViewRemovedFromParent(View v, int position);
}
