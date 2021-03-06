package com.fec.report.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.fec.xjoneproject.ui.supervise.CollectionListFragment;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

public class LocalPersonPhoneResEntityDao extends AbstractDao<LocalPersonPhoneResEntity, Long> {
    public static final String TABLENAME = "LOCAL_PERSON_PHONE_RES_ENTITY";

    public static class Properties {
        public static final Property AddTime = new Property(15, String.class, "addTime", false, "ADD_TIME");
        public static final Property AddUser = new Property(13, String.class, "addUser", false, "ADD_USER");
        public static final Property AddUserName = new Property(14, String.class, CollectionListFragment.ADDUSERNAME, false, "ADD_USER_NAME");
        public static final Property FkPPV = new Property(3, String.class, "fkPPV", false, "FK_PPV");
        public static final Property HolderAddress = new Property(10, String.class, "holderAddress", false, "HOLDER_ADDRESS");
        public static final Property HolderIdCard = new Property(8, String.class, "holderIdCard", false, "HOLDER_ID_CARD");
        public static final Property HolderName = new Property(7, String.class, "holderName", false, "HOLDER_NAME");
        public static final Property HolderPhone = new Property(9, String.class, "holderPhone", false, "HOLDER_PHONE");
        public static final Property Id = new Property(1, String.class, "id", false, "ID");
        public static final Property IsMatch = new Property(4, String.class, "isMatch", false, "IS_MATCH");
        public static final Property Latitude = new Property(22, Double.class, "latitude", false, "LATITUDE");
        public static final Property LocalFkPPV = new Property(2, Long.class, "localFkPPV", false, "LOCAL_FK_PPV");
        public static final Property LocalID = new Property(0, Long.class, "localID", true, "LOCAL_ID");
        public static final Property LocationDescription = new Property(23, String.class, "locationDescription", false, "LOCATION_DESCRIPTION");
        public static final Property Longitude = new Property(21, Double.class, "longitude", false, "LONGITUDE");
        public static final Property MismatchReason = new Property(5, String.class, "mismatchReason", false, "MISMATCH_REASON");
        public static final Property Modifier = new Property(18, String.class, "modifier", false, "MODIFIER");
        public static final Property ModifierName = new Property(19, String.class, "modifierName", false, "MODIFIER_NAME");
        public static final Property ModifyTime = new Property(20, String.class, "modifyTime", false, "MODIFY_TIME");
        public static final Property Note = new Property(12, String.class, "note", false, "NOTE");
        public static final Property OtherMismatchReason = new Property(6, String.class, "otherMismatchReason", false, "OTHER_MISMATCH_REASON");
        public static final Property PoliceCheck = new Property(11, String.class, "policeCheck", false, "POLICE_CHECK");
        public static final Property UserOrgName = new Property(17, String.class, "userOrgName", false, "USER_ORG_NAME");
        public static final Property UserOrganizationId = new Property(16, String.class, "userOrganizationId", false, "USER_ORGANIZATION_ID");
    }

    public LocalPersonPhoneResEntityDao(DaoConfig config) {
        super(config);
    }

    public LocalPersonPhoneResEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    public static void createTable(Database db, boolean ifNotExists) {
        db.execSQL("CREATE TABLE " + (ifNotExists ? "IF NOT EXISTS " : "") + "\"LOCAL_PERSON_PHONE_RES_ENTITY\" (\"LOCAL_ID\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"ID\" TEXT,\"LOCAL_FK_PPV\" INTEGER,\"FK_PPV\" TEXT,\"IS_MATCH\" TEXT,\"MISMATCH_REASON\" TEXT,\"OTHER_MISMATCH_REASON\" TEXT,\"HOLDER_NAME\" TEXT,\"HOLDER_ID_CARD\" TEXT,\"HOLDER_PHONE\" TEXT,\"HOLDER_ADDRESS\" TEXT,\"POLICE_CHECK\" TEXT,\"NOTE\" TEXT,\"ADD_USER\" TEXT,\"ADD_USER_NAME\" TEXT,\"ADD_TIME\" TEXT,\"USER_ORGANIZATION_ID\" TEXT,\"USER_ORG_NAME\" TEXT,\"MODIFIER\" TEXT,\"MODIFIER_NAME\" TEXT,\"MODIFY_TIME\" TEXT,\"LONGITUDE\" REAL,\"LATITUDE\" REAL,\"LOCATION_DESCRIPTION\" TEXT);");
    }

    public static void dropTable(Database db, boolean ifExists) {
        db.execSQL("DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCAL_PERSON_PHONE_RES_ENTITY\"");
    }

    protected final void bindValues(DatabaseStatement stmt, LocalPersonPhoneResEntity entity) {
        stmt.clearBindings();
        Long localID = entity.getLocalID();
        if (localID != null) {
            stmt.bindLong(1, localID.longValue());
        }
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
        Long localFkPPV = entity.getLocalFkPPV();
        if (localFkPPV != null) {
            stmt.bindLong(3, localFkPPV.longValue());
        }
        String fkPPV = entity.getFkPPV();
        if (fkPPV != null) {
            stmt.bindString(4, fkPPV);
        }
        String isMatch = entity.getIsMatch();
        if (isMatch != null) {
            stmt.bindString(5, isMatch);
        }
        String mismatchReason = entity.getMismatchReason();
        if (mismatchReason != null) {
            stmt.bindString(6, mismatchReason);
        }
        String otherMismatchReason = entity.getOtherMismatchReason();
        if (otherMismatchReason != null) {
            stmt.bindString(7, otherMismatchReason);
        }
        String holderName = entity.getHolderName();
        if (holderName != null) {
            stmt.bindString(8, holderName);
        }
        String holderIdCard = entity.getHolderIdCard();
        if (holderIdCard != null) {
            stmt.bindString(9, holderIdCard);
        }
        String holderPhone = entity.getHolderPhone();
        if (holderPhone != null) {
            stmt.bindString(10, holderPhone);
        }
        String holderAddress = entity.getHolderAddress();
        if (holderAddress != null) {
            stmt.bindString(11, holderAddress);
        }
        String policeCheck = entity.getPoliceCheck();
        if (policeCheck != null) {
            stmt.bindString(12, policeCheck);
        }
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(13, note);
        }
        String addUser = entity.getAddUser();
        if (addUser != null) {
            stmt.bindString(14, addUser);
        }
        String addUserName = entity.getAddUserName();
        if (addUserName != null) {
            stmt.bindString(15, addUserName);
        }
        String addTime = entity.getAddTime();
        if (addTime != null) {
            stmt.bindString(16, addTime);
        }
        String userOrganizationId = entity.getUserOrganizationId();
        if (userOrganizationId != null) {
            stmt.bindString(17, userOrganizationId);
        }
        String userOrgName = entity.getUserOrgName();
        if (userOrgName != null) {
            stmt.bindString(18, userOrgName);
        }
        String modifier = entity.getModifier();
        if (modifier != null) {
            stmt.bindString(19, modifier);
        }
        String modifierName = entity.getModifierName();
        if (modifierName != null) {
            stmt.bindString(20, modifierName);
        }
        String modifyTime = entity.getModifyTime();
        if (modifyTime != null) {
            stmt.bindString(21, modifyTime);
        }
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(22, longitude.doubleValue());
        }
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(23, latitude.doubleValue());
        }
        String locationDescription = entity.getLocationDescription();
        if (locationDescription != null) {
            stmt.bindString(24, locationDescription);
        }
    }

    protected final void bindValues(SQLiteStatement stmt, LocalPersonPhoneResEntity entity) {
        stmt.clearBindings();
        Long localID = entity.getLocalID();
        if (localID != null) {
            stmt.bindLong(1, localID.longValue());
        }
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
        Long localFkPPV = entity.getLocalFkPPV();
        if (localFkPPV != null) {
            stmt.bindLong(3, localFkPPV.longValue());
        }
        String fkPPV = entity.getFkPPV();
        if (fkPPV != null) {
            stmt.bindString(4, fkPPV);
        }
        String isMatch = entity.getIsMatch();
        if (isMatch != null) {
            stmt.bindString(5, isMatch);
        }
        String mismatchReason = entity.getMismatchReason();
        if (mismatchReason != null) {
            stmt.bindString(6, mismatchReason);
        }
        String otherMismatchReason = entity.getOtherMismatchReason();
        if (otherMismatchReason != null) {
            stmt.bindString(7, otherMismatchReason);
        }
        String holderName = entity.getHolderName();
        if (holderName != null) {
            stmt.bindString(8, holderName);
        }
        String holderIdCard = entity.getHolderIdCard();
        if (holderIdCard != null) {
            stmt.bindString(9, holderIdCard);
        }
        String holderPhone = entity.getHolderPhone();
        if (holderPhone != null) {
            stmt.bindString(10, holderPhone);
        }
        String holderAddress = entity.getHolderAddress();
        if (holderAddress != null) {
            stmt.bindString(11, holderAddress);
        }
        String policeCheck = entity.getPoliceCheck();
        if (policeCheck != null) {
            stmt.bindString(12, policeCheck);
        }
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(13, note);
        }
        String addUser = entity.getAddUser();
        if (addUser != null) {
            stmt.bindString(14, addUser);
        }
        String addUserName = entity.getAddUserName();
        if (addUserName != null) {
            stmt.bindString(15, addUserName);
        }
        String addTime = entity.getAddTime();
        if (addTime != null) {
            stmt.bindString(16, addTime);
        }
        String userOrganizationId = entity.getUserOrganizationId();
        if (userOrganizationId != null) {
            stmt.bindString(17, userOrganizationId);
        }
        String userOrgName = entity.getUserOrgName();
        if (userOrgName != null) {
            stmt.bindString(18, userOrgName);
        }
        String modifier = entity.getModifier();
        if (modifier != null) {
            stmt.bindString(19, modifier);
        }
        String modifierName = entity.getModifierName();
        if (modifierName != null) {
            stmt.bindString(20, modifierName);
        }
        String modifyTime = entity.getModifyTime();
        if (modifyTime != null) {
            stmt.bindString(21, modifyTime);
        }
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(22, longitude.doubleValue());
        }
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(23, latitude.doubleValue());
        }
        String locationDescription = entity.getLocationDescription();
        if (locationDescription != null) {
            stmt.bindString(24, locationDescription);
        }
    }

    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : Long.valueOf(cursor.getLong(offset + 0));
    }

    public LocalPersonPhoneResEntity readEntity(Cursor cursor, int offset) {
        return new LocalPersonPhoneResEntity(cursor.isNull(offset + 0) ? null : Long.valueOf(cursor.getLong(offset + 0)), cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), cursor.isNull(offset + 2) ? null : Long.valueOf(cursor.getLong(offset + 2)), cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), cursor.isNull(offset + 21) ? null : Double.valueOf(cursor.getDouble(offset + 21)), cursor.isNull(offset + 22) ? null : Double.valueOf(cursor.getDouble(offset + 22)), cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
    }

    public void readEntity(Cursor cursor, LocalPersonPhoneResEntity entity, int offset) {
        String str = null;
        entity.setLocalID(cursor.isNull(offset + 0) ? null : Long.valueOf(cursor.getLong(offset + 0)));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLocalFkPPV(cursor.isNull(offset + 2) ? null : Long.valueOf(cursor.getLong(offset + 2)));
        entity.setFkPPV(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIsMatch(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMismatchReason(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setOtherMismatchReason(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setHolderName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setHolderIdCard(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setHolderPhone(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setHolderAddress(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPoliceCheck(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setNote(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setAddUser(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setAddUserName(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setAddTime(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setUserOrganizationId(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setUserOrgName(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setModifier(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setModifierName(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setModifyTime(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setLongitude(cursor.isNull(offset + 21) ? null : Double.valueOf(cursor.getDouble(offset + 21)));
        entity.setLatitude(cursor.isNull(offset + 22) ? null : Double.valueOf(cursor.getDouble(offset + 22)));
        if (!cursor.isNull(offset + 23)) {
            str = cursor.getString(offset + 23);
        }
        entity.setLocationDescription(str);
    }

    protected final Long updateKeyAfterInsert(LocalPersonPhoneResEntity entity, long rowId) {
        entity.setLocalID(Long.valueOf(rowId));
        return Long.valueOf(rowId);
    }

    public Long getKey(LocalPersonPhoneResEntity entity) {
        if (entity != null) {
            return entity.getLocalID();
        }
        return null;
    }

    public boolean hasKey(LocalPersonPhoneResEntity entity) {
        return entity.getLocalID() != null;
    }

    protected final boolean isEntityUpdateable() {
        return true;
    }
}
