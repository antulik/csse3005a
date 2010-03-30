package edu.itee.antipodes.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import edu.itee.antipodes.domain.Tour;

public class JdbcTourDao extends SimpleJdbcDaoSupport implements TourDao {
	
	public List<Tour> getTourList() {
		String sql = "select * from tour";
		List<Tour> tours = getSimpleJdbcTemplate().query(sql, new TourMapper());
		return tours;
	}
	
	public void saveTour(Tour tour) {
		
	}
	
	public void dropTour(Tour tour) {
		
	}

    private static class TourMapper implements ParameterizedRowMapper<Tour> {

        public Tour mapRow(ResultSet rs, int rowNum) throws SQLException {
            Tour tr = new Tour();
            tr.setTourID(rs.getInt("tourID"));
            tr.setTourName(rs.getString("tourName"));
            tr.setTourDesc(rs.getString("tourDesc"));
            tr.setPrice(new Double(rs.getDouble("price")));
            tr.setTotalDays(rs.getInt("totalDays"));
            return tr;
        }

    }	
	
	
}
