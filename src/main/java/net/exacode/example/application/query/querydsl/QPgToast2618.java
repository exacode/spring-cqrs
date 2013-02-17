package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2618 is a Querydsl query type for QPgToast2618
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2618 extends com.mysema.query.sql.RelationalPathBase<QPgToast2618> {

    private static final long serialVersionUID = -8643305;

    public static final QPgToast2618 pgToast2618 = new QPgToast2618("pg_toast_2618");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2618> pgToast2618Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2618(String variable) {
        super(QPgToast2618.class, forVariable(variable), "pg_toast", "pg_toast_2618");
    }

    @SuppressWarnings("all")
    public QPgToast2618(Path<? extends QPgToast2618> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2618");
    }

    public QPgToast2618(PathMetadata<?> metadata) {
        super(QPgToast2618.class, metadata, "pg_toast", "pg_toast_2618");
    }

}

