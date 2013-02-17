package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDefaultAclRoleNspObjIndex is a Querydsl query type for QPgDefaultAclRoleNspObjIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDefaultAclRoleNspObjIndex extends com.mysema.query.sql.RelationalPathBase<QPgDefaultAclRoleNspObjIndex> {

    private static final long serialVersionUID = -1656848532;

    public static final QPgDefaultAclRoleNspObjIndex pgDefaultAclRoleNspObjIndex = new QPgDefaultAclRoleNspObjIndex("pg_default_acl_role_nsp_obj_index");

    public final NumberPath<Long> defaclnamespace = createNumber("defaclnamespace", Long.class);

    public final StringPath defaclobjtype = createString("defaclobjtype");

    public final NumberPath<Long> defaclrole = createNumber("defaclrole", Long.class);

    public QPgDefaultAclRoleNspObjIndex(String variable) {
        super(QPgDefaultAclRoleNspObjIndex.class, forVariable(variable), "pg_catalog", "pg_default_acl_role_nsp_obj_index");
    }

    @SuppressWarnings("all")
    public QPgDefaultAclRoleNspObjIndex(Path<? extends QPgDefaultAclRoleNspObjIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_default_acl_role_nsp_obj_index");
    }

    public QPgDefaultAclRoleNspObjIndex(PathMetadata<?> metadata) {
        super(QPgDefaultAclRoleNspObjIndex.class, metadata, "pg_catalog", "pg_default_acl_role_nsp_obj_index");
    }

}

