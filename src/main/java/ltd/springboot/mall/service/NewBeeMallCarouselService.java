package ltd.springboot.mall.service;

import ltd.springboot.mall.controller.vo.NewBeeMallIndexCarouselVO;
import ltd.springboot.mall.entity.Carousel;
import ltd.springboot.mall.util.PageQueryUtil;
import ltd.springboot.mall.util.PageResult;

import java.util.List;

public interface NewBeeMallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number
     * @return
     */
    List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number);
}
