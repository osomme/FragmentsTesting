package no.hiof.oskaras.fragmentstesting;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.graphics.drawable.Drawable;


public class FragmentViewModel extends ViewModel {
    private MutableLiveData<String> text = new MutableLiveData<>();
    private MutableLiveData<Drawable> image = new MutableLiveData<>();

    public MutableLiveData<String> getText() {
        return text;
    }

    public MutableLiveData<Drawable> getImage() {
        return image;
    }

    public void setText(String text) {
        this.text.setValue(text);
    }

    public void setImage(Drawable image) {
        this.image.setValue(image);
    }
}
