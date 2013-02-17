package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2619 is a Querydsl query type for QPgToast2619
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2619 extends com.mysema.query.sql.RelationalPathBase<QPgToast2619> {

    private static final long serialVersionUID = -8643304;

    public static final QPgToast2619 pgToast2619 = new QPgToast2619("pg_toast_2619");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2619> pgToast2619Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2619(String variable) {
        super(QPgToast2619.class, forVariable(variable), "pg_toast", "pg_toast_2619");
    }

    @SuppressWarnings("all")
    public QPgToast2619(Path<? extends QPgToast2619> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2619");
    }

    public QPgToast2619(PathMetadata<?> metadata) {
        super(QPgToast2619.class, metadata, "pg_toast", "pg_toast_2619");
    }

}

